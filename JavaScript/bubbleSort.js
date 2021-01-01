function swap(a, b, arr) {
  let tmp = arr[a];
  arr[a] = arr[b];
  arr[b] = tmp;
}

function bubbleSort(array) {
  for (let i = 0; i < array.length; i++) {
    for (let j = 0; j < array.length - 1 - i; j++) {
      if (array[j] > array[j + 1]) {
        swap(j, j + 1, array);
      }
    }
  }
  return array;
}

console.log(
  bubbleSort([1, 4, 2, 8, 345, 123, 43, 32, 5643, 63, 321, 34, 55, 234, 90, 92])
);
