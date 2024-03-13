function validateFields() {
    const email = frmRegister.email.value;
    const senha = frmRegister.password.value;
    if (email != "" || senha != "") {
        console.log("teste");
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
                frmRegister.street.value = res.bairro;
                frmRegister.address.value = res.logradouro;
                frmRegister.uf.value = res.uf;
            })
            .catch(erro => alert("Erro ao buscar os dados de endereço"));
}




