package br.com.bibliotecaltv.controller.interceptador;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptadorLogin extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object controller) throws IOException{
		String uri = request.getRequestURI();
		
		if((uri.endsWith("realizarLogin") || uri.endsWith("verificarLogin"))
				&& (request.getSession().getAttribute("usuarioLogado") == null)){
			return true;
		}else if ((uri.endsWith("realizarLogin") || uri.endsWith("verificarLogin"))
				&& (request.getSession().getAttribute("usuarioLogado") != null)){
			response.sendRedirect("acessarFormularioLogado");
			return false;
		}else if((request.getSession().getAttribute("usuarioLogado") != null)){
			return true;
		}
		response.sendRedirect("realizarLogin");
		return false;
	}
}
