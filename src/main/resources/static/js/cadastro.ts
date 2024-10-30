document.addEventListener('DOMContentLoaded', function () {
    var cadastroButton = document.getElementById('cadastro-submit');
    if (cadastroButton) {
        cadastroButton.addEventListener('click', function () {
            // Get the main page URL from the hidden <a> element
            var paginaPrincipalUrl = document.getElementById('paginaPrincipalUrl').getAttribute('href');
            // Redirect to the main page
            window.location.href = paginaPrincipalUrl;
        });
    }
});