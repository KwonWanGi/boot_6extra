package org.iclass.mvc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.iclass.mvc.dto.Gallery;
@Mapper
public interface GalleryMapper {

	List<Gallery> getList();
	int save(Gallery dto);
	List<Gallery> getOne(String writer);		//writer 가 작성한 글들
	int hearts(int idx);					//특정 글의 좋아요 갯수
}
