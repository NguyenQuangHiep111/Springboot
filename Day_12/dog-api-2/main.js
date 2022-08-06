const breedsListEl = document.getElementById("breed-list");

//https://dog.ceo/api/breeds/list/all
// Lấy danh sách giống loài và hiển thị

const getbreedList = async ()=>{
    try {
        let res = await axios.get("https://dog.ceo/api/breeds/list/all");
        //console.log(res);
        renderbreedList(res.data.message);
    } catch (error) {
         console.log(error);
    }
};

const renderbreedList = (obj) => {
    //console.log(obj);
    let keys = Object.keys(obj);
    //console.log(keys);

    let html ="";
    keys.forEach((key) =>{
        html += `<option value=${key}>${key}</option>`;
    });
    breedsListEl.innerHTML= html;

}
// btnRandom .addEventListener("click", async()=>{
//     try {
//         let response = await axios.get("https://dog.ceo/api/breeds/list/all")
//         console.log(response);

//         //imageEl.src = responseJson.message;


//     } catch (error) {
//         console.log(error);
//     }
// })

getbreedList();
