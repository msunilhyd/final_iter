import { initializeApp } from "firebase/app";
import { getAuth } from "firebase/auth";

const firebaseConfig = {
  apiKey: "AIzaSyBOlfCd2LB2hdquhMNB0r-pyyU_fnmjIek",
  authDomain: "whatsapp-clone-next-8b773.firebaseapp.com",
  projectId: "whatsapp-clone-next-8b773",
  storageBucket: "whatsapp-clone-next-8b773.appspot.com",
  messagingSenderId: "877840163978",
  appId: "1:877840163978:web:f02dc7769927ff46cc7973",
  measurementId: "G-3H35RFQX6K"
};

const app = initializeApp(firebaseConfig);
export const firebaseAuth = getAuth(app);