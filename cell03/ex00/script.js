function randomHexColor() {
	const r = Math.floor(Math.random() * 256);
	const g = Math.floor(Math.random() * 256);
	const b = Math.floor(Math.random() * 256);

	return `rgb(${r}, ${g}, ${b})`;
}

function applyRandomBackground() {
	document.body.style.backgroundColor = randomHexColor();
}

window.addEventListener('DOMContentLoaded', () => {
	const btn = document.getElementById('randomColorBtn');

	if (btn) {
		btn.addEventListener('click', applyRandomBackground);
	}

});
