package com.example.unit_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi.
     *
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     * - Bỏ qua điểm âm hoặc lớn hơn 10 (coi là dữ liệu sai)
     * - Nếu danh sách rỗng hoặc null, trả về 0
     */
    public int countExcellentStudents(List<Double> scores) {
        // Điều kiện 2: danh sách rỗng hoặc null
        if (scores == null || scores.isEmpty()) {
            return 0;
        }

        int count = 0;

        // Vòng lặp 1: duyệt danh sách để lọc học sinh giỏi
        for (Double score : scores) {
            // Điều kiện 1: validate điểm hợp lệ
            if (score >= 0 && score <= 10) {
                if (score >= 8.0) {
                    count++;
                }
            }
        }

        return count;
    }
}
