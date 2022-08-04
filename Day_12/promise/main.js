// Khới tạo promise

// let promise = new Promise((resolve, reject) => {});
// console.log(promise);

// let promiseSuscess = new Promise((resolve, reject) => {
//   resolve("Thực hiện lời hứa");
// });
// console.log(promiseSuscess);

// let promiseError = new Promise((resolve, reject) => {
//   reject("Thực hiện lời hứa thất bại");
// });
// console.log(promiseError);

//// HỨA : Cuối năm nếu có trên 30 triệu, sẽ mua iphone 13 pro max
let money = 20;

const buyIphone = () => {
  return new Promise((resolve, reject) => {
    if (money >= 30) {
      resolve("Đủ tiền mua Iphone");
    } else {
      reject("Không đủ tiền , cày tiếp năm sau mua");
    }
  });
};

// Hứa tiếp
// Nếu mua iphone xong, còn thừa tiền, nếu đủ thì mua con airpod (4 củ)

const buyAirpod = () => {
  return new Promise((resolve, reject) => {
    if (money - 30 - 4 >= 0) {
      resolve("Mua thêm airpod");
    } else {
      reject("Không đủ tiền mua airpod");
    }
  });
};

console.log(buyIphone());

buyIphone()
  .then((res) => {
    console.log(res);
    return buyAirpod();
  })
  .then((res1) => {
    console.log(res1);
  })
  .catch((err) => console.log(err))
  .finally(() => {
    // Luôn được thực hiện kể cả thành công hay thất bại
    console.log("Đi về nhà");
  });
