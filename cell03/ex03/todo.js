const COOKIE_NAME = 'ft_list_todos';

function getTodosFromCookie() {
	const match = document.cookie.split('; ').find(row => row.startsWith(COOKIE_NAME + '='));
	if (!match) 
		return [];
	try {
		return JSON.parse(decodeURIComponent(match.split('=')[1]));
	} catch (e) {
	return [];
	}
}

function saveTodosToCookie(todos) {
  const value = encodeURIComponent(JSON.stringify(todos));
  document.cookie = `${COOKIE_NAME}=${value}; path=/; max-age=31536000`;
}

function render() {
  const list = document.getElementById('ft_list');
  list.innerHTML = '';
  const todos = getTodosFromCookie();
  todos.forEach((todo, index) => {
    const div = document.createElement('div');
    div.className = 'todo';
    div.textContent = todo;
    div.onclick = () => deleteTodo(index);
    list.appendChild(div);
  });
}

function addTodo() {
  const text = prompt('Enter a new TO DO:');
  if (text && text.trim()) {
    const todos = getTodosFromCookie();
    todos.unshift(text.trim()); // Add at top
    saveTodosToCookie(todos);
    render();
  }
}

function deleteTodo(index) {
  if (confirm('Remove this TO DO?')) {
    const todos = getTodosFromCookie();
    todos.splice(index, 1);
    saveTodosToCookie(todos);
    render();
  }
}

document.addEventListener('DOMContentLoaded', render);
