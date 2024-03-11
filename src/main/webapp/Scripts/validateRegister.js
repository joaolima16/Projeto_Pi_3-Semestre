const verify = () =>{
    let nome = frmRegister.email.value
    console.log(nome);
}

const verifyCEP = ()=>{
    const cep = frmRegister.cep.value
    const url = `https://viacep.com.br/ws/${cep}/json/`;
    fetch(url)
            .then(response =>response.json())
            .then(res => console.log(res))
            .catch(erro => console.log(error))
    
}

