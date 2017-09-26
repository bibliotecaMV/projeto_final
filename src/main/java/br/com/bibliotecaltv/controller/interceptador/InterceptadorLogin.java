package br.com.bibliotecaltv.controller.interceptador;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class InterceptadorLogin extends HandlerInterceptorAdapter{
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object controller) throws IOException{
		String uri = request.getRequestURI();

		if(((uri.endsWith("realizarLoginMonitor") ||
				uri.endsWith("verificarLoginMonitor")
				|| uri.endsWith("mostrarInicio"))&&
				request.getSession().getAttribute("usuarioLogadoAdministrador")
				!= null)){
			response.sendRedirect("acessarFormularioLogadoAdministrador");
			return false;
		}
		if(((uri.endsWith("realizarLoginAdministrador") ||
				uri.endsWith("verificarLoginAdministrador")
				|| uri.endsWith("mostrarInicio"))&&
				request.getSession().getAttribute("usuarioLogadoMonitor")
				!= null)){
			response.sendRedirect("acessarFormularioLogadoMonitor");
			return false;
		}
		if((((uri.endsWith("realizarLoginAdministrador") ||
				uri.endsWith("verificarLoginAdministrador")
				|| uri.endsWith("mostrarInicio"))&&
				request.getSession().getAttribute("usuarioLogadoAdministrador")
				== null))){
			return true;
		}
		if(((uri.endsWith("realizarLoginAdministrador") ||
				uri.endsWith("verificarLoginAdministrador")
				|| uri.endsWith("mostrarInicio"))&&
				request.getSession().getAttribute("usuarioLogadoAdministrador")
				!= null)){
			response.sendRedirect("acessarFormularioLogadoAdministrador");
			return false;
		}
		if((((uri.endsWith("realizarLoginMonitor") ||
				uri.endsWith("verificarLoginMonitor")
				|| uri.endsWith("mostrarInicio"))&&
				request.getSession().getAttribute("usuarioLogadoMonitor")
				== null))){
			return true;
		}
		if(((uri.endsWith("realizarLoginMonitor") ||
				uri.endsWith("verificarLoginMonitor")
				|| uri.endsWith("mostrarInicio"))&&
				request.getSession().getAttribute("usuarioLogadoMonitor")
				!= null)){
			response.sendRedirect("acessarFormularioLogadoMonitor");
			return false;
		}
		if((request.getSession().getAttribute("usuarioLogadoAdministrador") != null)){
			return true;
		}
		if((request.getSession().getAttribute("usuarioLogadoMonitor") 
				!= null)){
			return true;
		}
		if((request.getSession().getAttribute("usuarioLogadoAdministrador") == null)){
			response.sendRedirect("realizarLoginAdministrador");
			return false;
		}
		if((request.getSession().getAttribute("usuarioLogadoMonitor") 
				== null)){
			response.sendRedirect("realizarLoginMonitor");
			return false;
		}
		response.sendRedirect("mostrarInicio");
		return false;
	}
}
