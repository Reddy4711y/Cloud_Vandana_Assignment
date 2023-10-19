const readline = require("readline");
const read = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

function reverseWordsInSentence(sentence) {
  const words = sentence.split(" ");
  const reversedWords = words.map((word) => reverseWord(word));
  return reversedWords.join(" ");
}

function reverseWord(word) {
  return word.split("").reverse().join("");
}

read.question("Enter a sentence: ", (inputSentence) => {
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log("Reversed sentence:", reversedSentence);
  read.close();
});
