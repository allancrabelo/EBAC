# Cadastro simples com Bootstrap

Instrucoes rapidas para usar Bootstrap com CDN e o formulario criado.

## Como usar este projeto
1. Abra `index.html` em um navegador.
2. O formulario ja esta estilizado com Bootstrap 5.3.3 via CDN.
3. `styles.css` contem ajustes visuais simples (nao obrigatorios).

## O essencial do Bootstrap via CDN
- CSS: adicione no `<head>`:
  ```html
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
  ```
- JS (opcional, para componentes que precisam de JS como modal ou dropdown):
  ```html
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
  ```
- Sempre carregue o CSS antes do seu CSS proprio. O JS pode ir antes do fechamento de `</body>`.

## O que ha no formulario
- Container centralizado com `container`, `row`, `col`.
- Campos com `form-label`, `form-control`, e espacamento `mb-3`.
- Botao com `btn`, `btn-primary`, `w-100`.
- Campos: nome (texto), e-mail (email), telefone (tel), mais botao Enviar.

## Dicas rapidas sobre classes uteis
- Grid: `container`, `row`, `col-*` para layout responsivo.
- Formularios: `form-label`, `form-control`, `form-text`, `form-check`, `input-group`.
- Espacamento: `mt-*`, `mb-*`, `py-*`, `px-*` (0 a 5).
- Botoes: `btn`, variantes (`btn-primary`, `btn-secondary`, etc.), tamanhos (`btn-sm`, `btn-lg`), largura (`w-100`).

## Personalizar
- Ajuste cores ou espaçamento em `styles.css`. Exemplo:
  ```css
  .btn-primary { background-color: #0d6efd; }
  ```
- Para usar offline, baixe os arquivos do Bootstrap ou instale via npm e referencie localmente em vez da CDN.
