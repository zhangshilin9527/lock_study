package com.xiaolinzi.lock.study;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.locks.ReentrantLock;

@SpringBootTest
class LockStudyApplicationTests {

	@Test
	void contextLoads() {
		ReentrantLock lock = new ReentrantLock();
		lock.lock();
	}

}
