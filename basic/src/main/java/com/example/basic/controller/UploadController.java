package com.example.basic.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller
public class UploadController {
	@GetMapping("/upload1")
	public String upload1() {
		return "upload1";
	}

	@PostMapping("/upload1")
	@ResponseBody
	
	// �߰��Ǿ�� �ϴ� ���
	// 1. ������ġ�� ������ ����  2. ������ ������ DB�� ����
	
	
	public String upload1Post(MultipartHttpServletRequest mRequest) {
		String result = "";
		List<MultipartFile> mFiles = mRequest.getFiles("file");
		for(int i = 0; i < mFiles.size(); i++) {
			MultipartFile mFile = mFiles.get(i);
			
			String oName = mFile.getOriginalFilename();
			// ���ϸ� �ߺ� �˻�
			File file = new File("c:/dev/fileUpload/" + oName );
			
			String saveName = "";	// �ߺ��˻� �� ���� ���ߵ� ���ϸ�
			
			int idx = oName.lastIndexOf(".");
			String ext = oName.substring(idx);
			
			if(ext.equals("jpg")||ext.equals("gif")||ext.equals("png")) {
					// 0.jpg -> 0_1124035(���н� Ÿ��).jpg �� ������ ��ȹ => indexOf ���
					if( file.exists() ) {	// ������ �����ϴ� ���(�ߺ� ����)
						idx = oName.lastIndexOf(".");
						String name = oName.substring(0, idx);
						ext = oName.substring(idx);
						saveName = name + "_" + System.currentTimeMillis() + ext;
					} else {
						saveName = oName;
					}
			} else {
				continue;
			}
			
			try {
				mFile.transferTo(new File("c:/dev/fileUpload/" + saveName));
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			result += oName + "\n";
		}
		return result;
	}
}