import CryptoJS from 'crypto-js';

export const encrypt = (plainText: string, key: string): string => {
    const cipherText = CryptoJS.AES.encrypt(plainText, key).toString();
    return cipherText;
}


export const decrypt = (cipherText: string, key: string): string => {
    const bytes = CryptoJS.AES.decrypt(cipherText, key);
    const plainText = bytes.toString(CryptoJS.enc.Utf8);
    return plainText;
}