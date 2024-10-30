document.addEventListener('DOMContentLoaded', function () {
    var loginButton = document.getElementById('login-submit');
    if (loginButton) {
        loginButton.addEventListener('click', function () {
            // Get the main page URL from the hidden <a> element
            var paginaPrincipalUrl = document.getElementById('paginaPrincipalUrl').getAttribute('href');
            // Redirect to the main page
            window.location.href = paginaPrincipalUrl;
        });
    }
});