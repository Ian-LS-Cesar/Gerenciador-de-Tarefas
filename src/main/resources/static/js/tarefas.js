document.addEventListener('DOMContentLoaded', function () {
    var tituloTarefaInput = document.getElementById('titulo-tarefa');
    var descricaoTarefaInput = document.getElementById('descricao-tarefa');
    var prazoTarefaInput = document.getElementById('prazo-tarefa');
    var salvarButton = document.getElementById('salvar-tarefa-button');
    var tarefasPendentesDiv = document.getElementById('lista-tarefas-pendentes');
    salvarButton.addEventListener('click', function () {
        criarTarefa();
    });

    function formatarData(dateString){
        const date = new Date(dateString);
        const dia = date.getDate().toString().padStart(2, '0');
        const mes = (date.getMonth() + 1).toString().padStart(2, '0');
        const ano = date.getFullYear();
        return `${dia}/${mes}/${ano}`;
    }

    function criarTarefa() {
        var titulo = tituloTarefaInput.value;
        var descricao = descricaoTarefaInput.value;
        var prazo = formatarData(prazoTarefaInput.value);
        
        var tarefa = document.createElement('div');

        tarefa.classList.add('tarefa-pendente');
        tarefa.innerHTML = `
        <h3>${titulo}</h3>
        <p>${descricao}</p>
        <p><strong>Prazo:</strong> ${prazo}</p>
        `;
        tarefasPendentesDiv.appendChild(tarefa);
        tituloTarefaInput.value = '';
        descricaoTarefaInput.value = '';
        prazoTarefaInput.value = '';
    }
});
