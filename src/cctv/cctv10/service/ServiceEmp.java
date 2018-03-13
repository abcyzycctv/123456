package cctv.cctv10.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cctv.cctv10.dao.EmpDao;

@Service
@Transactional
public class ServiceEmp {
		@Resource
		private EmpDao ed;
}
