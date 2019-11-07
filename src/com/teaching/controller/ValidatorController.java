package com.teaching.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValidatorController {
	int width = 70;
	int height = 20;
	private char[] validatorCode = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f',
			'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'x', 'r', 'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
			'J', 'K', 'L', 'M', 'N', 'X', 'Y', 'Z' };

	@RequestMapping("validateCode")
	@ResponseBody
	public void getCode(HttpSession session, HttpServletResponse response) throws Exception {

		BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2d = img.createGraphics();// 设置二维画笔
		// 设置验证码边框
		Font f = new Font("Fixedsys", Font.PLAIN, height - 2);
		graphics2d.setColor(Color.white);
		graphics2d.setFont(f);
		graphics2d.setColor(Color.white);// 设置画板底色
		graphics2d.fillRect(0, 0, width, height);// 填充画板
		
		graphics2d.drawRect(0, 0, width - 1, height - 1);
		// 写验证码
		Random rd = new Random();
		graphics2d.setColor(Color.black);// 设置画笔颜色
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= 4; i++) {
			String valueOf = String.valueOf(validatorCode[rd.nextInt(28)]);
			sb.append(valueOf);
			graphics2d.drawString(valueOf, i * (width / 6), height - 4);
		}

		for (int i = 1; i <= 9; i++) {
			int x1 = rd.nextInt(width);
			int y1 = rd.nextInt(height);
			int x2 = x1 + rd.nextInt(7);
			int y2 = y1 + rd.nextInt(3);
			graphics2d.drawLine(x1, y1, x2, y2);
		}
		// 返回验证码图片
		session.setAttribute("validateCode", sb.toString());
		response.setContentType("image/jpeg");
		ServletOutputStream sos = response.getOutputStream();
		ImageIO.write(img, "jpeg", sos);
		sos.close();
	}
}
