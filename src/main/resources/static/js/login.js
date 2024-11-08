document.addEventListener('DOMContentLoaded', function () {
    var loginButton = document.getElementById('login-submit');
    var paginaTarefaElement = document.getElementById('paginaTarefaUrl');
    if (loginButton && paginaTarefaElement) {
        loginButton.addEventListener('click', function () {
            var paginaTarefaUrl = paginaTarefaElement.getAttribute('href');
            if (paginaTarefaUrl) {
                window.location.href = paginaTarefaUrl;
            }
            else {
                console.error('O atributo href está faltando no elemento paginaTarefaUrl.');
            }
        });
    }
    else {
        console.error('Botão de login ou elemento paginaTarefaUrl não encontrado.');
    }
});
