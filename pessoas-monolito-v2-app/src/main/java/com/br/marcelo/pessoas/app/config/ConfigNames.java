package com.br.marcelo.pessoas.app.config;

public interface ConfigNames {

	String NAME_CONFIG_SERVIDOR = "java.naming.provider.url";
	String LINK_SISTEMA = "link.sistema";
	
	public interface JMS_Email{
		String EMAIL_CONVITE = "EMAIL_CONVITE";
		String EMAIL_BEM_VINDO = "EMAIL_BEM_VINDO";
		String PERFIL_USUARIO = "PERFIL_USUARIO";
		String DADOS_CONDOMINIO = "DADOS_CONDOMINIO";
	}

	public interface ROLES {
		String ROLE_MUNICIPIO = "ROLE_MUNICIPIO";
		String ROLE_AREA_ATUACAO = "ROLE_AREA_ATUACAO";
		String ROLE_CARGO = "ROLE_CARGO";
		String ROLE_CATEGORIA_CARGO = "ROLE_CATEGORIA_CARGO";
		String ROLE_EXPEDIENTE = "ROLE_EXPEDIENTE";
		String ROLE_GRUPO = "ROLE_GRUPO";
		String ROLE_LOCALIZACAO = "ROLE_LOCALIZACAO";
		String ROLE_PARTIDO = "ROLE_PARTIDO";
		String ROLE_PF = "ROLE_PF";
		String ROLE_PJ = "ROLE_PJ";
		String ROLE_PF_REL = "ROLE_PF_REL";
		String ROLE_PJ_REL = "ROLE_PJ_REL";
		String ROLE_PROFISSAO = "ROLE_PROFISSAO";
		String ROLE_CATEGORIA_PROFISSAO = "ROLE_CATEGORIA_PROFISSAO";
		String ROLE_REGIAO = "ROLE_REGIAO";
		String ROLE_RESPONSAVEL = "ROLE_RESPONSAVEL";
		String ROLE_SOLICITACAO = "ROLE_SOLICITACAO";
		String ROLE_SOLICITACAO_REL = "ROLE_SOLICITACAO_REL";
		String ROLE_TIPO_SOLICITACAO = "ROLE_TIPO_SOLICITACAO";
		String ROLE_TEMA_SOLICITACAO = "ROLE_TEMA_SOLICITACAO";
		String ROLE_SITUACAO_SOLICITACAO = "ROLE_SITUACAO_SOLICITACAO";
		String ROLE_USUARIO = "ROLE_USUARIO";
		String ROLE_USUARIO_LOG = "ROLE_USUARIO_LOG";
		String ROLE_SOL_REL= "ROLE_SOL_REL";
		String ROLE_MUNICIPIO_REL= "ROLE_MUNICIPIO_REL";
	}
}
