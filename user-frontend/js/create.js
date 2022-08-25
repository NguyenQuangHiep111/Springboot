const provinceEl = document.querySelector("#address");


// Lấy ds tỉnh thành phố
const getProvince = async () => {
    try {
        let res = await axios.get("https://provinces.open-api.vn/api/p/");
        console.log(res);

        renderProvince(res.data)
    } catch (error) {
        console.log(error);
    }
}
// Hiển thị tỉnh thành phố
const renderProvince = arr => {
    provinceEl.innerHTML = "";

    let html = "<option hidden>-- Chọn tỉnh thành phố</option>";
    arr.forEach(p => {
        html += `<option value=${p.name}>${p.name}</option>`
    });
    provinceEl.innerHTML = html;
}
getProvince();

const nameEl = document.getElementById("name");
const emailEl = document.getElementById("email");
const phoneEl = document.getElementById("phone");
// ...

const btnSave = document.getElementById("btn-save");
btnSave.addEventListener("click", async function () {
    try {
        // 1. Lấy thông tin user cần tạo từ các ô input

        // 2. Có thể kiểm tra validate 1 số trường không được để trống

        // 3. Gọi API với các thông tin user có được ở trên để tạo user

        // 4. Nếu tạo thành công thì quay lại trang danh sách
    } catch (error) {
        // Xử lý nếu có lỗi xảy ra
    }
});
