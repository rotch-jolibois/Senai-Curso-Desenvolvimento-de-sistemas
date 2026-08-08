function gerarRelatorio() {
    document.getElementById("relatorio").innerHTML = `
        <h2>Relatório de Clientes</h2>
        <p><strong>Quantidade de clientes cadastrados:</strong> 100</p>
        <p><strong>Clientes ativos:</strong> 80</p>
        <p><strong>Clientes inativos:</strong> 20</p>

        <h3>Últimos clientes cadastrados:</h3>
        <ul>
            <li>João Silva</li>
            <li>Maria Oliveira</li>
            <li>Carlos Souza</li>
            <li>Ana Lima</li>
            <li>Pedro Santos</li>
        </ul>

        <p><strong>Data do relatório:</strong> ${new Date().toLocaleString()}</p>
    `;
}
if(nome.value == ""){
    alert("Informe o nome.");
    return;
}
if(cpf.value == ""){
    alert("Informe o CPF.");
    return;
}
if(!email.value.includes("@")){
    alert("Email inválido.");
    return;
}window.onload = function(){

const hoje = new Date();

const ano = hoje.getFullYear();
const mes = String(hoje.getMonth()+1).padStart(2,"0");
const dia = String(hoje.getDate()).padStart(2,"0");

document.getElementById("dataCadastro").value=
`${ano}-${mes}-${dia}`;

}
confirm("Deseja excluir este cliente?");
let clientes = [];
let cliente = {
    nome: nome,
    cpf: cpf,
    telefone: telefone,
    email: email,
    cidade: cidade,
    estado: estado,
    data: data,
    status: status
};
clientes.push(cliente);
