$(document).ready(function() {
    // When form is submitted
    $('#taskForm').submit(function(e) {
        e.preventDefault();

        const taskText = $('#taskInput').val();

        if(taskText.trim() === '') {
            alert('Please enter a task!');
            return;
        }

        $('.empty-message').remove();

        const newTask = $('<li></li>').text(taskText);

        $('#taskList').append(newTask);

        $('#taskInput').val('');

        $('#taskInput').focus();
    });

    $(document).on('click', '#taskList li', function() {
        $(this).toggleClass('completed');
    });
});
