// 1 số cách gọi API

// 2. Sử dụng axios (package bên thứ 3 ) => impport
// 3. Sử dụng AJAX (jquery) => impport

//Thao tác 
// Bấm nút -> Gọi API -> Có kết quả -> Hiển thị

// 1. Sử dụng fetch API có sẵn của JavaScript
// const btnRandom  = ducument.getElenmenById("btn-Random");
// const imageEl  = ducument.getElenmenById("image");

// btnRandom .addEventListener("click",async()=>{
//     try {
//         let response = await fetch("https://dog.ceo/api/breeds/image/random")
//         console.log(response);

//         let responseJson = await response.json();
//         console.log(responseJson);

//         imageEl.src = responseJson.message;


//     } catch (error) {
//         console.log(error);
//     }
// })

// 2. Sử dụng axios (package bên thứ 3 ) => impport
// const btnRandom  = ducument.getElenmenById("btn-Random");
// const imageEl  = ducument.getElenmenById("image");
const btnRandom = ducument.getElementById('btn-Random');
const imageEl  = ducument.getElementById('image');

btnRandom .addEventListener("click", async()=>{
    try {
        let response = await axios.get("https://dog.ceo/api/breeds/image/random")
        console.log(response);

        //imageEl.src = responseJson.message;


    } catch (error) {
        console.log(error);
    }
})