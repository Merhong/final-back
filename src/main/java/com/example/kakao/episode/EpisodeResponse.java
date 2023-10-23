// package com.example.kakao.episode;

// import java.util.List;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

// import com.example.kakao.product.Product;
// import com.example.kakao.product.option.Option;

// import lombok.Getter;
// import lombok.Setter;
// import lombok.ToString;

// public class EpisodeResponse {

//     @ToString
//     @Getter
//     @Setter
//     public static class FindAllDTO {
//         private Integer id;
//         private String title;
//         private String author;
//         private Double starCount;
//         private String image;

//         public FindAllDTO(Episode episode) {
//             this.id = webtoon.getId();
//             this.title = webtoon.getTitle();
//             this.author = webtoon.getAuthor();
//             this.starCount = webtoon.getStarCount();
//             this.image = webtoon.getImage();
//         }
//     }

//     // (기능2) 상품 상세보기
//     @Getter
//     @Setter
//     public static class FindByIdDTO {
//         private Integer productId;
//         private String productName;
//         private String productImage;
//         private Integer productPrice;
//         private Integer productStartCount;
//         private List<OptionDTO> options;

//         public FindByIdDTO(Product product) {
//             this.productId = product.getId();
//             this.productName = product.getProductName();
//             this.productImage = product.getImage();
//             this.productPrice = product.getPrice();
//             this.productStartCount = 5;
//             this.options = product.getOptions().stream()
//                     .map(o -> new OptionDTO(o))
//                     .collect(Collectors.toList());
//         }

//         @Getter
//         @Setter
//         class OptionDTO {
//             private Integer optionId;
//             private String optionName;
//             private Integer optionPrice;

//             OptionDTO(Option option) {
//                 this.optionId = option.getId();
//                 this.optionName = option.getOptionName();
//                 this.optionPrice = option.getPrice();
//             }
//         }
//     }

//     // 상품조회 + 옵션조회
//     @Getter
//     @Setter
//     public static class FindByIdV1DTO {
//         private Integer productId;
//         private String productName;
//         private String productImage;
//         private Integer productPrice;
//         private Integer productStartCount;
//         private List<OptionDTO> options;

//         public FindByIdV1DTO(Product product, List<Option> options) {
//             this.productId = product.getId();
//             this.productName = product.getProductName();
//             this.productImage = product.getImage();
//             this.productPrice = product.getPrice();
//             this.productStartCount = 5;
//             this.options = options.stream()
//                     .map(o -> new OptionDTO(o))
//                     .collect(Collectors.toList());
//         }

//         @Getter
//         @Setter
//         class OptionDTO {
//             private Integer optionId;
//             private String optionName;
//             private Integer optionPrice;

//             OptionDTO(Option option) {
//                 this.optionId = option.getId();
//                 this.optionName = option.getOptionName();
//                 this.optionPrice = option.getPrice();
//             }
//         }
//     }

//     // 양방향 매핑
//     @Getter
//     @Setter
//     public static class FindByIdV2DTO {
//         private Integer productId;
//         private String productName;
//         private String productImage;
//         private Integer productPrice;
//         private Integer productStartCount;
//         private List<OptionDTO> options;

//         public FindByIdV2DTO(Product product) {
//             this.productId = product.getId();
//             this.productName = product.getProductName();
//             this.productImage = product.getImage();
//             this.productPrice = product.getPrice();
//             this.productStartCount = 5;
//             System.out.println("이제 Lazy Loading 한다 =================");
//             this.options = product.getOptions().stream()
//                     .map(o -> new OptionDTO(o))
//                     .collect(Collectors.toList());
//         }

//         @Getter
//         @Setter
//         class OptionDTO {
//             private Integer optionId;
//             private String optionName;
//             private Integer optionPrice;

//             OptionDTO(Option option) {
//                 System.out.println("이제 Lazy Loading 시작됨 =========");
//                 this.optionId = option.getId();
//                 this.optionName = option.getOptionName();
//                 this.optionPrice = option.getPrice();
//             }
//         }
//     }

//     // 옵션만 조회
//     @Getter
//     @Setter
//     public static class FindByIdV3DTO {
//         private Integer productId;
//         private String productName;
//         private String productImage;
//         private Integer productPrice;
//         private Integer productStartCount;
//         private List<OptionDTO> options;

//         public FindByIdV3DTO(List<Option> options) {
//             System.out.println("이제 Lazy 시작한다???????????????????????");
//             this.productId = options.get(0).getProduct().getId();
//             this.productName = options.get(0).getProduct().getProductName();
//             this.productImage = options.get(0).getProduct().getImage();
//             this.productPrice = options.get(0).getProduct().getPrice();
//             this.productStartCount = 5;
//             this.options = options.stream()
//                     .map(o -> new OptionDTO(o))
//                     .collect(Collectors.toList());
//         }

//         @Getter
//         @Setter
//         class OptionDTO {
//             private Integer optionId;
//             private String optionName;
//             private Integer optionPrice;

//             OptionDTO(Option option) {
//                 this.optionId = option.getId();
//                 this.optionName = option.getOptionName();
//                 this.optionPrice = option.getPrice();
//             }
//         }
//     }
// }