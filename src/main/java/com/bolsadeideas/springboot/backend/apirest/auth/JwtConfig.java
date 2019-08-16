package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {

	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";
		
	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n" + 
			"MIIEpAIBAAKCAQEA03RuRjo4CNW2aPe9gRODxnyzSDrZAzYH12qhLMwVk1lXiy31\r\n" + 
			"bRhxtioeyAi7u2wgB3PSxWsYpNPlgGx7rWafpsQICGyn5fcfDLXsSMgzoUMvvlN+\r\n" + 
			"ejgzuTOeA8wgfic0q9zoQNKPSFtYK7nc5dzAj4qDotiU5UqotgxYjwtyD1cEVc2G\r\n" + 
			"gEglOguQrrh9FkaHuHi2w6/YICq+/rx+cWT/Zjuo+hw8RffSxBlZc4BQReJkZnWV\r\n" + 
			"28XT5eDV+zNE/GhSSwelrckn+6H5qUeCYlA31mI5fE5Byzyx8YZDp8JgPjaB99um\r\n" + 
			"ZnpaybuK3iYQaKA34BIfGU9eSc4OXvqDALOC8QIDAQABAoIBAQC0+jKjgpKQ5TCw\r\n" + 
			"2FBmF+ixyeq7yDoSaHz/nvCBYc6ZhV7K7TPgAorYSWZ8+BSNDbbACh57/vRhpkYH\r\n" + 
			"y1FzEKFV3vOtGin9Rataep3XkRm3TMShFd7rBg0m1onIYD3zGuUWrwRM7qnZWOy2\r\n" + 
			"x+XLCkv4zqlpiAqv0F1jKl/lVftyKg5rT6bsKkpzmFPF2VWvM8UipjgseEewQANC\r\n" + 
			"TZIfKPdE7zGDAbtcjMD6ARn4aphXS4Subo+oTTlOLd+HRuS1DXRsgjdE2j4MyWvX\r\n" + 
			"3kmK4dJakVuAI+0beKUnSgHOTXEXm/cQXgKWx1TZk78pSX/FcpPTD8d/SOtl8JYn\r\n" + 
			"8I1OEIjRAoGBAOvkb4SNtmrEI+tXlF1uqasplUx3HqiiKnPOewHP4NaDWVjXgoOm\r\n" + 
			"Ee3QYtHKmOTcp+eqorNW3EsNl0wg23WvMWX1PaJJSHLmcb9KVqIabU0lPxZb9C5X\r\n" + 
			"LI1XC5vtrdgxLv+26ZMnJjnOWMTXiZjKYY/XyHtED60zBt3vd12hxMi1AoGBAOV6\r\n" + 
			"uklLAnvpSxEOCfEpy2dgD1lmZI7Re5xpq/7Iuau5JzWV2+JNR53XWz/ymd+hKmdd\r\n" + 
			"fmCPQBHsUoyXMyytTx+8NQpUXwerHlyRU7ePVsJq1aPVdFhmbB+L+6uVAW8O4c6W\r\n" + 
			"/+1adR1ZdN78ewtziHuLRaTXYy2rPICLmJKpk+LNAoGAP8qv6b3VFfxi5lLx2W6C\r\n" + 
			"zbnaGSqhjOMF7flpxGyuFfTBZcgqEGYJtTFEeA182W9erMS1aSBVRKqxPrIoByRQ\r\n" + 
			"jI0MlOWShRgSrLNyyDWzV0h6Thah6yJB9xsSFaHqAGwUlKynb9cHfFx0Hw9Ws44P\r\n" + 
			"YjHtkoAuaR1CfyQyOIz1xX0CgYEA2aI9Tglvf6jPYotX7nneyFmX9Qdg0vnlK4Ak\r\n" + 
			"eGxReoUMpItNkCAOjamShuFEAYzNtF483sK81sKzv1YeWH69DbHm87b0sUceclf5\r\n" + 
			"d5rfg17i4pAr2TK51Glj82RLidIpYU5fxfEGJSGT726wGzok9FYvZJhJHSTLKnY5\r\n" + 
			"6s4czPkCgYApoJLSfL6tckLOvWQwguCBSK17DsmUh7SUwppLEyrPz8ZtcKpXjD4E\r\n" + 
			"PxUJCbPHIZQL2n394xhgXFoa/oqn36zocjRVKP7+Hbho/81bGBty4eLcBEPcxBha\r\n" + 
			"sbS2T2hLAs/PGQMpf6+bCQHr504j4LIg2Ri7ltN6oklRMpZvGLB91g==\r\n" + 
			"-----END RSA PRIVATE KEY-----";
	
	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n" + 
			"MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA03RuRjo4CNW2aPe9gROD\r\n" + 
			"xnyzSDrZAzYH12qhLMwVk1lXiy31bRhxtioeyAi7u2wgB3PSxWsYpNPlgGx7rWaf\r\n" + 
			"psQICGyn5fcfDLXsSMgzoUMvvlN+ejgzuTOeA8wgfic0q9zoQNKPSFtYK7nc5dzA\r\n" + 
			"j4qDotiU5UqotgxYjwtyD1cEVc2GgEglOguQrrh9FkaHuHi2w6/YICq+/rx+cWT/\r\n" + 
			"Zjuo+hw8RffSxBlZc4BQReJkZnWV28XT5eDV+zNE/GhSSwelrckn+6H5qUeCYlA3\r\n" + 
			"1mI5fE5Byzyx8YZDp8JgPjaB99umZnpaybuK3iYQaKA34BIfGU9eSc4OXvqDALOC\r\n" + 
			"8QIDAQAB\r\n" + 
			"-----END PUBLIC KEY-----";
}
