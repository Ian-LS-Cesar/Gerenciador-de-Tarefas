document.addEventListener('DOMContentLoaded', function () {
    var loginButton = document.getElementById('login-submit');
    if (loginButton) {
        loginButton.addEventListener('click', function () {
            window.location.href = 'pagina_principal.html';
        });
    }
});
