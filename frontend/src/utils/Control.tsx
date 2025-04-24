import React from 'react'
import Navbar from '../components/Navbar'
import Footer from '../components/Footer'
import { Navigate } from 'react-router-dom'
import { userProfile } from '../services/userService'

function Control( props: { item: JSX.Element } ) {

    // cookie
    const cookie = document.cookie
    const jwtCookie = cookie.split('; ').find(row => row.startsWith('token='))
    const jwtCookieText = jwtCookie ? jwtCookie.split('=')[1] : null
    console.log('jwtCookieText', jwtCookieText)

 
    const jwt = localStorage.getItem('token')
    userProfile().then( res => {
    }).catch( err => {
      localStorage.clear()
      window.location.href = '/'
    })
  

  return (
    <>
      {  jwt === null && <Navigate to={'/'} /> }
      {  jwt !== null && 
        <>
          <Navbar />
            <div style={{ minHeight: '50vh'}}>{ props.item }</div>
          <Footer />
        </> 
      }
    </>
  )
}

export default Control