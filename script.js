// Menu móvel toggle
document.getElementById('menuToggle').addEventListener('click', function() {
    const navLinks = document.querySelector('.nav-links');
    navLinks.classList.toggle('active');
});

// Fechar menu ao clicar em um link
document.querySelectorAll('.nav-links a').forEach(link => {
    link.addEventListener('click', function() {
        document.querySelector('.nav-links').classList.remove('active');
    });
});

// Solicitar consulta
document.querySelectorAll('.add-cart').forEach(button => {
    button.addEventListener('click', function() {
        const productName = this.closest('.product-card').querySelector('h3').textContent;
        alert(`Obrigado pelo seu interesse!\n\n${productName}\n\nNosso concierge entrará em contato em breve para oferecer uma experiência personalizada.`);
    });
});

// Enviar formulário de contato
document.querySelector('.contact-form').addEventListener('submit', function(e) {
    e.preventDefault();
    alert('Obrigado! Sua mensagem foi enviada com sucesso!');
    this.reset();
});
