package com.singplayground.security;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.ldap.userdetails.LdapUserDetailsImpl;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomLdapAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
		try {
			//HttpSession session = request.getSession();
			//User authUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();  
			//System.out.println("getid : " + session.getId());
			//System.out.println("this is cretae time : " + session.getCreationTime());
			LdapUserDetailsImpl authUser = (LdapUserDetailsImpl) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
			//session.setAttribute("username", authUser.getUsername());

			System.out.println("======= this is authentication : ");
			System.out.println("******* " + authUser.getAuthorities().toString());
			Collection<GrantedAuthority> authority = authUser.getAuthorities();
			System.out.println("the size of authority : " + authority.size());

			System.out.println("username : " + authUser.getUsername());
			System.out.println("password : " + authUser.getPassword());
			//			CustomUser cuser = new CustomUser();
			//			cuser.setEmail("abc@arbaholding.com");
			//			cuser.setUsername("username");
			//			UsernamePasswordAuthenticationToken customer = new UsernamePasswordAuthenticationToken("", "");
			//			customer.setDetails(cuser);

			//SecurityContextHolder.getContext().setAuthentication(customer);
			System.out.println("------- end of the authentication ----");
			response.setStatus(HttpServletResponse.SC_OK);
			response.sendRedirect("basic/test");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
