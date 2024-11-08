document.addEventListener('DOMContentLoaded', () => {
    const tituloTarefaInput = document.getElementById('titulo-tarefa') as HTMLInputElement;
    const descricaoTarefaInput = document.getElementById('descricao-tarefa') as HTMLTextAreaElement;
    const prazoTarefaInput = document.getElementById('prazo-tarefa') as HTMLInputElement;
    const salvarButton = document.getElementById('salvar-tarefa-button') as HTMLButtonElement;
    const tarefasPendentesDiv = document.getElementById('lista-tarefas-pendentes') as HTMLElement;

    salvarButton.addEventListener('click', () => {
        criarTarefa();
    });

    function criarTarefa() {
        const titulo = tituloTarefaInput.value;
        const descricao = descricaoTarefaInput.value;
        const prazo = prazoTarefaInput.value;

        const tarefa = document.createElement('div');
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