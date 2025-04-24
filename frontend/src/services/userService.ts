import { IJWTProfile, IUser } from "../models/IUser";
import { IUserRegister } from "../models/IUserRegister";
import api, { jwtApi } from "./api";

export const userLogin = ( email: string, password: string ) => {
    const sendObj = {
        email: email,
        password: password
    }
    return api.post<IUser>('auth/login', sendObj)
}

export const userRegister = ( name: string, email: string, password: string ) => {
    const sendObj = {
        name: name,
        email: email,
        password: password
    }
    return api.post<IUserRegister>('auth/signup', sendObj)
}

export const userProfile = ( ) => {
    const jwt = localStorage.getItem('token')
    if (!jwt) {
        throw new Error('JWT token not found in localStorage')
    }
    jwtApi.defaults.headers.common['Authorization'] = `Bearer ${jwt}`
    /*
    const header = {
        Authorization: `Bearer ${jwt}`,
    }
    */
    return jwtApi.get<IJWTProfile>('profile/me')
}

