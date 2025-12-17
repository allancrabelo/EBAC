## O que é jQuery?

jQuery é uma biblioteca JavaScript que torna **fácil manipular elementos HTML** e **controlar eventos** (cliques, envios de formulário, etc).

Ele simplifica tarefas que seriam complicadas em JavaScript puro.

**Analogia:** Se JavaScript é como um carro, jQuery é como um carro com controle remoto - muito mais fácil de usar!

---

## Como incluir jQuery no seu projeto

Adicione esta linha no seu `<head>` do HTML (antes de seu script):

```html
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
```

Depois adicione seu arquivo JavaScript:

```html
<script src="script.js"></script>
```

---

## 1️⃣ Seletores jQuery - Encontrando Elementos

jQuery usa o símbolo `$()` para encontrar elementos HTML.

### Sintaxe Básica:
```javascript
$('seletor')  // Encontra elementos
```

### Exemplos:

```javascript
// Por ID
$('#taskInput')       // Encontra elemento com id="taskInput"

// Por classe
$('.completed')       // Encontra elementos com class="completed"

// Por tag
$('li')              // Encontra todas as tags <li>
$('button')          // Encontra todos os <button>

// Por atributo
$('[type="text"]')   // Encontra elementos com type="text"
```

---

## 2️⃣ Manipular Conteúdo e Atributos

### Pegar e definir texto:

```javascript
// Pegar texto
const texto = $('#taskInput').val();  // Pega o valor do input

// Definir texto
$('#taskInput').val('Nova tarefa');   // Define o valor do input

// Adicionar texto a um elemento
$('h1').text('Minha Lista');          // Define o texto
$('p').html('<b>Negrito</b>');        // Define com HTML
```

### Adicionar classes:

```javascript
// Adicionar uma classe
$('li').addClass('completed');        // Adiciona class="completed"

// Remover uma classe
$('li').removeClass('completed');     // Remove a classe

// Toggle (alterna entre adicionar e remover)
$('li').toggleClass('completed');     // Alterna a classe
```

---

## 3️⃣ Criar e Adicionar Elementos

### Criar novo elemento:

```javascript
const novoElemento = $('<li></li>');  // Cria uma tag <li>
const novoDiv = $('<div>Olá</div>');  // Cria <div>Olá</div>
```

### Adicionar elemento à página:

```javascript
// Adicionar ao final (inside)
$('#taskList').append(novoElemento);     // Adiciona dentro, no final
$('#taskList').prepend(novoElemento);    // Adiciona dentro, no início

// Adicionar antes ou depois (outside)
$('#taskList').after(novoElemento);      // Adiciona depois (fora)
$('#taskList').before(novoElemento);     // Adiciona antes (fora)
```

### Remover elementos:

```javascript
$('.empty-message').remove();         // Remove do DOM
$('li').empty();                      // Remove o conteúdo (não a tag)
```

---

## 4️⃣ Eventos - Respondendo a Ações do Usuário

Eventos são ações do usuário: cliques, digitação, envio de formulário, etc.

### Click (Clique):

```javascript
// Quando elemento é clicado
$('button').click(function() {
    alert('Botão foi clicado!');
});
```

### Submit (Enviar Formulário):

```javascript
// Quando formulário é enviado
$('#taskForm').submit(function(e) {
    e.preventDefault();  // Impede comportamento padrão (recarregar página)
    alert('Formulário enviado!');
});
```

### Change (Mudança):

```javascript
// Quando input muda
$('#taskInput').change(function() {
    console.log('Valor mudou para: ' + $(this).val());
});
```

### Keyup (Tecla solto):

```javascript
// Quando usuário solta uma tecla
$('#taskInput').keyup(function() {
    console.log('Tecla foi solta!');
});
```

### On (Evento genérico):

```javascript
// Forma genérica (mais poderosa)
$('button').on('click', function() {
    alert('Clicado!');
});
```

---

## 5️⃣ Usar `this` em Eventos

Dentro de um evento, `this` se refere ao elemento que recebeu o evento.

```javascript
$('li').click(function() {
    // this = o <li> que foi clicado
    $(this).toggleClass('completed');  // Alterna classe do <li> clicado
});
```

**Importante:** Use `$(this)` para aplicar métodos jQuery a um elemento!

---

## 6️⃣ Event Delegation - Eventos em Elementos Dinâmicos

Se você cria elementos DEPOIS do carregamento da página, precisa usar delegação:

```javascript
// ❌ NÃO funciona para elementos criados depois
$('li').click(function() {
    alert('Clicado!');
});

// ✅ FUNCIONA para elementos criados depois
$(document).on('click', 'li', function() {
    alert('Clicado!');
});
```

---

## 7️⃣ Document Ready - Esperar Carregamento

SEMPRE coloque seu código dentro de `$(document).ready()`:

```javascript
$(document).ready(function() {
    // Seu código aqui
    // Garante que os elementos HTML já foram carregados
    
    $('#button').click(function() {
        alert('Clicado!');
    });
});
```

---

## 8️⃣ Animações Simples

jQuery oferece animações prontas:

```javascript
// Fade (desaparecer/aparecer)
$('li').fadeIn();      // Aparecer gradualmente
$('li').fadeOut();     // Desaparecer gradualmente
$('li').fadeToggle();  // Alterna

// Slide (deslizar)
$('li').slideDown();   // Deslizar para baixo
$('li').slideUp();     // Deslizar para cima
$('li').slideToggle(); // Alterna

// Custom (customizado)
$('li').animate({
    opacity: 0.5,      // Transparência
    marginLeft: '20px' // Margem esquerda
}, 300);               // 300ms de duração
```

---

## 9️⃣ Métodos Úteis

### Verificar se elemento existe:

```javascript
if ($('#taskInput').length > 0) {
    console.log('Elemento existe!');
}
```

### Contar elementos:

```javascript
const quantidade = $('li').length;
console.log('Total de tarefas: ' + quantidade);
```

### Iterar sobre elementos:

```javascript
$('li').each(function(index, element) {
    console.log(index + ': ' + $(element).text());
});
```

### Encontrar dentro de um elemento:

```javascript
// Encontrar dentro de #taskList
$('#taskList').find('li');

// É o mesmo que:
$('#taskList li');
```

### Pegar pai/filho:

```javascript
$('li').parent();        // Elemento pai
$('li').children();      // Elementos filhos
$('li').siblings();      // Elementos irmãos
```

---

## 🔟 Exemplo Prático - Nossa Lista de Tarefas

Veja como usamos jQuery no seu projeto:

```javascript
$(document).ready(function() {
    
    // 1. Capturar envio do formulário
    $('#taskForm').submit(function(e) {
        e.preventDefault();  // Impede recarregar página
        
        // 2. Pegar valor do input
        const taskText = $('#taskInput').val();
        
        // 3. Validar
        if(taskText.trim() === '') {
            alert('Digite algo!');
            return;
        }
        
        // 4. Remover mensagem vazia
        $('.empty-message').remove();
        
        // 5. Criar novo elemento
        const newTask = $('<li></li>').text(taskText);
        
        // 6. Adicionar à lista
        $('#taskList').append(newTask);
        
        // 7. Limpar input
        $('#taskInput').val('');
        
        // 8. Focar novamente
        $('#taskInput').focus();
    });
    
    // 9. Clicar em tarefa = marcar como completa
    $(document).on('click', '#taskList li', function() {
        $(this).toggleClass('completed');
    });
});
```

---

## 📋 Cheat Sheet - Métodos Mais Usados

```javascript
// Seletores
$('#id')                    // Por ID
$('.classe')                // Por classe
$('tag')                    // Por tag

// Conteúdo
.text()                     // Pegar/definir texto
.val()                      // Pegar/definir valor (inputs)
.html()                     // Pegar/definir HTML

// Classes
.addClass('classe')         // Adicionar classe
.removeClass('classe')      // Remover classe
.toggleClass('classe')      // Alternar classe

// Criar/Remover
$('<tag>Texto</tag>')       // Criar elemento
.append(elemento)           // Adicionar dentro
.remove()                   // Remover elemento

// Eventos
.click(função)              // Clique
.submit(função)             // Enviar formulário
.change(função)             // Mudança
.on('evento', função)       // Evento genérico

// Navegação
.parent()                   // Elemento pai
.children()                 // Filhos diretos
.find('seletor')            // Buscar dentro

// Útil
.length                     // Quantidade de elementos
.each(função)               // Iterar sobre cada um
$(this)                     // Elemento atual
```

---

## 💡 Dicas Importantes

1. **Sempre use `$(document).ready()`** - Garante que HTML foi carregado
2. **Use `event.preventDefault()`** em formulários - Impede recarregar página
3. **Use `$(this)` em eventos** - Referencia o elemento clicado
4. **Use event delegation para elementos dinâmicos** - `$(document).on('click', 'li', ...)`
5. **jQuery é mais fácil que JavaScript puro** - Mas aprenda os dois!

---

## 🚀 Próximos Passos

1. ✅ Você dominou os **fundamentos**
2. 📖 Explore a [documentação oficial](https://jquery.com/)
3. 🔨 Pratique fazendo **seus próprios projetos**
4. 🎓 Aprenda **JavaScript puro** depois (jQuery é construída nele!)

---

## 📚 Recursos Úteis

- [jQuery Official Docs](https://jquery.com/)
- [jQuery API Reference](https://api.jquery.com/)
- [W3Schools jQuery Tutorial](https://www.w3schools.com/jquery/)

---

**Parabéns!** Você agora sabe o suficiente de jQuery para criar projetos incríveis! 🎉
