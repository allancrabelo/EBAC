document.addEventListener('DOMContentLoaded', function() {
	const form = document.getElementById('randomizer-form');
	const input = document.getElementById('max-number');
	const resultEl = document.getElementById('random-result');

	if (!form || !input) {
		return;
	}


	form.addEventListener('submit', function(event) {
		event.preventDefault();
		const maxValue = parseInt(input.value, 10);
		if (isNaN(maxValue) || maxValue <= 0) {
			if (resultEl) {
				resultEl.textContent = 'Informe um número válido maior que 0.';
			}
			return;
		}

		const randomNumber = Math.floor(Math.random() * maxValue);
		if (resultEl) {
			resultEl.textContent = String(randomNumber);
		}
	});
});
