//package com.prac.angular.userService.config;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.stereotype.Component;
//
//@Component
//@ConfigurationProperties
//public class JwtConfig {
//	private Jwt jwt = new Jwt();
//	
//	public static class Jwt {
//        private String header;
//
//        public String getHeader() {
//			return header;
//		}
//
//		public void setHeader(String header) {
//			this.header = header;
//		}
//
//		public String getSecret() {
//			return secret;
//		}
//
//		public void setSecret(String secret) {
//			this.secret = secret;
//		}
//
//		public Long getExpiration() {
//			return expiration;
//		}
//
//		public void setExpiration(Long expiration) {
//			this.expiration = expiration;
//		}
//
//		public String getIssuer() {
//			return issuer;
//		}
//
//		public void setIssuer(String issuer) {
//			this.issuer = issuer;
//		}
//
//		public String getAuthenticationPath() {
//			return authenticationPath;
//		}
//
//		public void setAuthenticationPath(String authenticationPath) {
//			this.authenticationPath = authenticationPath;
//		}
//
//		private String secret;
//
//        private Long expiration;
//
//        private String issuer;
//
//        private String authenticationPath;
//
//        
//    }
//
//	public Jwt getJwt() {
//		return jwt;
//	}
//
//	public void setJwt(Jwt jwt) {
//		this.jwt = jwt;
//	}
//}
