package com.teaching.controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.swetake.util.Qrcode;
import com.teaching.bean.Student;
import com.teaching.bean.Teacher;

@Controller
public class ImgController {

	//学生二维码信息
	@RequestMapping("toLookImage")
	@ResponseBody
	public void toLookImage(HttpSession session,HttpServletResponse response) throws Exception {
		Student stu = (Student) session.getAttribute("stu");
		StringBuffer sb = new StringBuffer();
		sb.append("姓名");
		sb.append(stu.getName());
		sb.append(",");
		sb.append("性别");
		sb.append(stu.getSex());
		sb.append(",");
		sb.append("电话");
		sb.append(stu.getTel());
		sb.append(",");
		sb.append("地址");
		sb.append(stu.getAddress());
		sb.append(",");
		sb.append("头像");
		sb.append(stu.getFiles());
		
		//生成二维码,9为版本号
		int width = 67 + 12 * (9-1);
		int height = 67 + 12 * (9-1);
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2d = image.createGraphics();
		//设置画板底色
		graphics2d.setBackground(Color.white);
		//设置画笔颜色
		graphics2d.setColor(Color.black);
		graphics2d.clearRect(0, 0, width, height);
		Qrcode q = new Qrcode();
		//设置纠错级别为中级
		q.setQrcodeErrorCorrect('M');
		//设置二维码包含的信息
		q.setQrcodeEncodeMode('B');
		//设置版本
		q.setQrcodeVersion(9);
		//设置偏移量
		int a = 2;
		boolean[][] qrcode = q.calQrcode(sb.toString().getBytes());
		for(int i =0;i<qrcode.length;i++) {
			for (int j = 0; j < qrcode.length; j++) {
				if(qrcode[j][i]) {
				graphics2d.fillRect(j*3+a, i*3+a, 3, 3);
				}
			}
		}
		//graphics2d.dispose();//撤销画笔
		//image.flush();//刷新画笔
		//流输出二维码
		response.setContentType("img/jpeg");
		ServletOutputStream os = response.getOutputStream();
		ImageIO.write(image, "png", os);
		os.close();
	}
	//教师二维码信息
	@RequestMapping("toLookImage1")
	@ResponseBody
	public void toLookImage1(HttpSession session,HttpServletResponse response) throws Exception {
		Teacher teach = (Teacher) session.getAttribute("teach");
		StringBuffer sb = new StringBuffer();
		sb.append("姓名");
		sb.append(teach.getName());
		
		//生成二维码,9为版本号
		int width = 67 + 12 * (9-1);
		int height = 67 + 12 * (9-1);
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics2D graphics2d = image.createGraphics();
		//设置画板底色
		graphics2d.setBackground(Color.white);
		//设置画笔颜色
		graphics2d.setColor(Color.black);
		graphics2d.clearRect(0, 0, width, height);
		Qrcode q = new Qrcode();
		//设置纠错级别为中级
		q.setQrcodeErrorCorrect('M');
		//设置二维码包含的信息
		q.setQrcodeEncodeMode('B');
		//设置版本
		q.setQrcodeVersion(9);
		//设置偏移量
		int a = 2;
		boolean[][] qrcode = q.calQrcode(sb.toString().getBytes());
		for(int i =0;i<qrcode.length;i++) {
			for (int j = 0; j < qrcode.length; j++) {
				if(qrcode[j][i]) {
				graphics2d.fillRect(j*3+a, i*3+a, 3, 3);
				}
			}
		}
		//graphics2d.dispose();//撤销画笔
		//image.flush();//刷新画笔
		//流输出二维码
		response.setContentType("img/jpeg");
		ServletOutputStream os = response.getOutputStream();
		ImageIO.write(image, "png", os);
		os.close();
	}
}
