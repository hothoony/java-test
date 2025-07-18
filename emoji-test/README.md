## UTF-8 인코딩 크기
- U+0000 ~ U+007F : 1바이트
- U+0080 ~ U+07FF : 2바이트
- U+0800 ~ U+FFFF : 3바이트
- U+10000 ~ U+10FFFF : 4바이트

## BMP (Basic Multilingual Plane)
- 다국어 기본 평면
- 유니코드의 첫째(0번) 평면
- 코드포인트 범위: U+0000 ~ U+FFFF (16진수)

| 평면 번호 (Plane) | 평면 이름 (Plane Name)                        | 코드포인트 범위 (16진수)      | 설명                   |
| ------------- | ----------------------------------------- | -------------------- | -------------------- |
| 0             | Basic Multilingual Plane (BMP)            | U+0000 \~ U+FFFF     | 기본 다국어 평면, 대부분 문자 포함 |
| 1             | Supplementary Multilingual Plane (SMP)    | U+10000 \~ U+1FFFF   | 이모지, 고대 문자, 음악 기호 등  |
| 2             | Supplementary Ideographic Plane (SIP)     | U+20000 \~ U+2FFFF   | CJK 확장 한자 B\~F 영역    |
| 3             | Tertiary Ideographic Plane (TIP)          | U+30000 \~ U+3FFFF   | 확장 한자 (사용 빈도 낮음)     |
| 4             | Supplementary Special-purpose Plane (SSP) | U+40000 \~ U+4FFFF   | 특수 목적 문자             |
| 5             | Supplementary Private Use Area-A (PUA-A)  | U+50000 \~ U+5FFFF   | 개인 용도 영역 A           |
| 6             | Supplementary Private Use Area-B (PUA-B)  | U+60000 \~ U+6FFFF   | 개인 용도 영역 B           |
| 7\~13         | Unassigned                                | U+70000 \~ U+DFFFF   | 할당되지 않은 영역           |
| 14            | Supplementary Special-purpose Plane (SSP) | U+E0000 \~ U+EFFFF   | 특수 용도 문자 (예: 태그 문자)  |
| 15            | Private Use Area Plane 15                 | U+F0000 \~ U+FFFFF   | 개인 용도 영역             |
| 16            | Private Use Area Plane 16                 | U+100000 \~ U+10FFFF | 개인 용도 영역             |

## 데이터베이스 생성
- db1, utf8mb4
```sql
CREATE DATABASE mydb_utf8mb4 CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;

CREATE TABLE mydb_utf8mb4.tb_notice (
    notice_id INT PRIMARY KEY,
    notice_title VARCHAR(255)
) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
```
- db2, utf8
```sql
CREATE DATABASE mydb_utf8 CHARACTER SET utf8 COLLATE utf8_general_ci;

CREATE TABLE mydb_utf8.tb_notice (
    notice_id INT PRIMARY KEY,
    notice_title VARCHAR(255)
) CHARACTER SET utf8 COLLATE utf8_general_ci;
```
