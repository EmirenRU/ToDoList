document.addEventListener('DOMContentLoaded', function() {
    const taskList = document.getElementById('taskList');
    const taskInput = document.getElementById('taskInput');
    const addTaskBtn = document.getElementById('addTaskBtn');

    addTaskBtn.addEventListener('click', function() {
        const taskName = taskInput.value.trim();
        if (taskName !== '') {
            addTask(taskName);
            taskInput.value = '';
        }
    });

    function addTask(taskName) {
        const li = document.createElement('li');
        li.textContent = taskName;
        taskList.appendChild(li);
    }
});
