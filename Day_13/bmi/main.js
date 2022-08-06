const btnRandomColorName = document.querySelector("#btn-Post");

btnRandomColorName.addEventListener("click", async () => {
    try {
        let res = await axios.get("http://localhost:8080//bmi-get");
        console.log(res);

        document.body.style.backgroundColor = res.data;
    } catch (error) {
        console.log("Lỗi")
        console.log(error.response);
        alert(error.response.data.message);
    }
})