// Import the functions you need from the SDKs you need
import { initializeApp } from "firebase/app";
import { getAnalytics } from "firebase/analytics";
// TODO: Add SDKs for Firebase products that you want to use
// https://firebase.google.com/docs/web/setup#available-libraries

// Your web app's Firebase configuration
// For Firebase JS SDK v7.20.0 and later, measurementId is optional
const firebaseConfig = {
  apiKey: "AIzaSyBQ87yhugLV7TcWcr2chgzrN_45DqlUE68",
  authDomain: "something-76d0a.firebaseapp.com",
  projectId: "something-76d0a",
  storageBucket: "something-76d0a.appspot.com",
  messagingSenderId: "698270054962",
  appId: "1:698270054962:web:73af7923cbb19ac60fda2b",
  measurementId: "G-TNWTS2RTPJ"
};

// Initialize Firebase
const app = initializeApp(firebaseConfig);
const analytics = getAnalytics(app);