function validateFields() {
    const email = frmRegister.email.value;
    const senha = frmRegister.password.value;
    const cpf = frmRegister.cpf.value;
    const cep = frmRegister.cep.value;
    if (email != "" && senha != "" && cpf != "") {

        document.querySelector("#btnRegister").disabled = false;
    } else {
        document.querySelector("#btnRegister").disabled = true;
    }
}
function consultingCep() {
    const cep = frmRegister.cep.value;

    const url = `https://viacep.com.br/ws/${cep}/json/`;
    fetch(url)
            .then((response) => response.json())
            .then((res) => {
                console.log(res);
                if (res.erro === true) {
                    alert("CEP Invalido");
                    document.querySelector("#inputCep").value = "";
                } else {
                    frmRegister.street.value = res.bairro;
                    frmRegister.address.value = res.logradouro;
                    frmRegister.uf.value = res.uf;
                }

            })
            .catch(erro => alert("Erro ao buscar os dados de endereço"));
}

function verifyCPF() {
    const input = document.querySelector("#inputCpf");
    var inputLength = input.value.length;
    if (inputLength === 3 || inputLength === 7) {
        input.value += ".";
    } else if (inputLength === 11) {
        input.value += "-";

    }
}
function maskCEP() {
    const input = document.querySelector("#inputCep")
    const inputLength = input.value.length;
    if (inputLength === 5) {
        input.value += "-";

    }

}



