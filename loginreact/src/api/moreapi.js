const api = process.env.REACT_APP_CONTACTS_API_URL || 'http://localhost:8080';


const headers = {
    'Accept': 'application/json'
};

export const doLogin = (payload) =>
    fetch(`${api}/user/login`, {
        method: 'POST',
        headers: {
            ...headers,
            'Content-Type': 'application/json'
        },
        credentials:'include',
        body: JSON.stringify(payload)
    }).then(res => res.json()).then(res => {

        return res;
    })
        .catch(error => {
            console.log("This is error");
            return error;
        });




export const dosignup = (payload) =>
    fetch(`${api}/user/add`, {
        method: 'POST',
        headers: {
            ...headers,
            'Content-Type': 'application/json'
        },
        credentials:'include',
        body: JSON.stringify(payload)
    }).then(res => res.json()).then(res => {

        return res;
    })
        .catch(error => {
            console.log("This is error");
            return error;
        });


export const createdir = (payload) =>
    fetch(`${api}/createdir`, {
        method: 'POST',
        headers: {
            ...headers,
            'Content-Type': 'application/json'
        },
        credentials:'include',
        body: JSON.stringify(payload)
    }).then(res => res.json()).then(res => {

        return res;
    })
        .catch(error => {
            console.log("This is error");
            return error;
        });

