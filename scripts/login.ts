document.addEventListener('DOMContentLoaded', () => {
    const loginButton = document.getElementById('login-submit') as HTMLButtonElement;

    if (loginButton) {
        loginButton.addEventListener('click', () => {
            window.location.href = 'pagina_principal.html';
        });
    }
});