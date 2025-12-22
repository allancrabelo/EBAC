document.addEventListener('DOMContentLoaded', function() {
	const form = document.getElementById('randomizer-form');
	const input = document.getElementById('max-number');

	if (!form || !input) {
		return;
	}


	form.addEventListener('submit', function(event) {
		event.preventDefault();
		const maxValue = parseInt(input.value, 10);
		if (isNaN(maxValue) || maxValue <= 0) {
			alert('Informe um número válido maior que 0.');
			return;
		}

		const randomNumber = Math.floor(Math.random() * maxValue);
		alert('Your random number is: ' + randomNumber);
	});
});
