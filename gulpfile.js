const gulp = require('gulp');
const sass = require('gulp-sass')(require('sass'));
const imagemin = require('gulp-imagemin');
const terser = require('gulp-terser');
const concat = require('gulp-concat');
const rename = require('gulp-rename');
const sourcemaps = require('gulp-sourcemaps');


function compilaSass() {
	return gulp.src('src/scss/style.scss')
		.pipe(sourcemaps.init())
		.pipe(sass({ outputStyle: 'compressed' }).on('error', sass.logError))
		.pipe(rename({ suffix: '.min' }))
		.pipe(sourcemaps.write('.'))
		.pipe(gulp.dest('dist/css'));
}


function imagens() {
	return gulp.src('src/images/**/*')
		.pipe(imagemin())
		.pipe(gulp.dest('dist/images'));
}


function scripts() {
	return gulp.src('src/js/**/*.js')
		.pipe(sourcemaps.init())
		.pipe(concat('main.js'))
		.pipe(terser())
		.pipe(rename({ suffix: '.min' }))
		.pipe(sourcemaps.write('.'))
		.pipe(gulp.dest('dist/js'));
}


function watchFiles() {
	gulp.watch('src/scss/**/*.scss', compilaSass);
	gulp.watch('src/js/**/*.js', scripts);
	gulp.watch('src/images/**/*', imagens);
}


exports.sass = compilaSass;
exports.imagens = imagens;
exports.scripts = scripts;
exports.watch = watchFiles;
exports.default = gulp.parallel(compilaSass, imagens, scripts);
