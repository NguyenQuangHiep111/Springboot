// const URL_API = "http://localhost:8080/api/courses";

// // Truy cập vào các thành phần
// const todoListEl = document.querySelector(".container");

// // Lưu lại công việc
// let todos = [];

// // Danh sách API ======
// // 1. Lấy danh sách tất cả cv
// const getTodoAPI = () => {
//     return axios.get(URL_API); // trả về promise
// }

// // 2. Xóa cv
// // const deleteTodoAPI = (id) => {
// //     return axios.delete(`${URL_API}/${id}`); // trả về promise
// // }


// // Hàm xử lý =====
// // 1. Lấy danh sách tất cả cv
// const getTodo = async () => {
//     try {
//         let res = await getTodoAPI();
//         console.log(res);

//         todos = res.data; // lưu lại
//         renderTodo(todos) // res.data = array
//     } catch (error) {
//         console.log(error);
//     }
// }

// // 2. Xóa cv
// // const deleteTodo = async (id) => {
// //     try {
// //         let isConfirm = confirm("Bạn có muốn xóa không?");
// //         if (isConfirm) {
// //             await deleteTodoAPI(id); // Xóa trên server;

// //             // Xóa trên mảng ban đầu (splice, filter)
// //             todos = todos.filter(t => t.id != id);

// //             // Hiển thị lại trên giao diện
// //             renderTodo(todos);
// //         }
// //     } catch (error) {
// //         console.log(error)
// //     }
// // }

// // Hiển thị ds todo ra ngoài giao diện
// const renderTodo = arr => {
//     todoListEl.innerHTML = "";

//     if (arr.length == 0) {
//         todoListEl.innerHTML = "Không có công việc nào trong danh sách";
//         return;
//     }

//     let html = "";
//     arr.forEach(t => {
//         // html += `
//         //     <div class="todo-item ${t.status ? "active-todo" : ""}">
//         //         <div class="todo-item-title">
//         //             <input type="checkbox" ${t.status ? "checked" : ""}/>
//         //             <p>${t.title}</p>
//         //         </div>
//         //         <div class="option">
//         //             <button class="btn btn-update">
//         //                 <img src="./img/pencil.svg" alt="icon" />
//         //             </button>
//         //             <button class="btn btn-delete" onclick="deleteTodo(${t.id})">
//         //                 <img src="./img/remove.svg" alt="icon" />
//         //             </button>
//         //         </div>
//         //     </div>
//         // `
//         html += `
//         <div class="container">
//             <div class="row">
//                 <div class="col-md-3">
//                     <h2 class="fs-5 mb-4">Chủ đề</h2>
//                     <div class="topic-item input-group d-flex align-items-center mb-1">
//                         <input type="radio" value="Backend" id="backend" name="topic">
//                         <label for="backend" class="ms-2 fs-5">${t.topics}</label>
//                     </div>
                    
//                 </div>

//                 <div class="col-md-9">
//                     <div class="row">
//                         <div class="col-md-4">
//                             <div class="seach-form d-flex align-items-center rounded shadow-sm mb-4 pe-3">
//                                 <input type="text" placeholder="Tìm kiếm khóa học" class="form-control border-0 seach-form-input">
//                                 <span class="text-black-50 seach-form-button"><i class="fa-solid fa-magnifying-glass"></i></span>
//                             </div>
//                         </div>
//                     </div>
//                     <div class="course-list row">
//                         <div class="col-md-4">
//                             <a href="./detail.html">
//                                 <div class="course-item shadow-sm rounded mb-4">
//                                     <div class="course-item-image">
//                                         <img src="https://media.techmaster.vn/api/static/8028/bpfneoc51co8tcg6lek0" ${t.image} />
//                                             alt="khoa hoc">
//                                     </div>
//                                     <div class="course-item-info p-3">
//                                         <h2 class="fs-5 mb-3 text-dark">${t.title}</h2>
//                                         <p class="type fw-light text-black-50">${t.type}</p>
//                                     </div>
//                                 </div>
//                             </a>
//                         </div>
                            
//                         </div>
//                     </div>
//                 </div>
//             </div>
//         `


//     });

//     todoListEl.innerHTML = html;
// }

// getTodo();

const courseListEl = document.querySelector(".course-list");
const URL_API = "http://localhost:8080/api/courses";
let courses = [];
let topic = "";
let title= "";


// DANH SÁCH API
const getCourseAPI = () => {
    return axios.get(`${URL_API}/?topic=${topic}&title=${title}`);
}


// HÀM XỬ LÝ
const getCourses = async () =>{
    try{
        let res = await getCourseAPI(); // Api get all course
        courses = res.data;
        console.log(res.data)
        renderCourses(courses);

    }catch(error){
        console.log(error)
    }
}

const getSelectedOption = () =>{
    for(let i = 0 ; i < topicItems.length; i++){
        if(topicItems[i].checked){
            return topicItems[i].value;
        }
    }
}




// Hiển thị khóa học
const renderCourses = (arr) => {
    courseListEl.innerHTML = "";
    if (arr.length == 0) {
        courseListEl.innerHTML = "Không có khóa học ";
        return;
    }

    let html = "";
    arr.forEach(course => {
        html += `
            <div class="col-md-4">
                <a href="./detail.html?id=${course.id}">
                    <div class="course-item shadow-sm rounded mb-4">
                        <div class="course-item-image">
                            <img src="${course.image}"
                            alt="Khoa hoc">
                        </div>
                        <div class="course-item-info p-3">
                            <h2 class="fs-5 mb-3 text-dark">${course.title}</h2>
                            <p class="type fw-light text-black-50 ">${course.type}</p>
                        </div>
                    </div>
                </a>
            </div>
        `
    });


    courseListEl.innerHTML = html;
}

getCourses()