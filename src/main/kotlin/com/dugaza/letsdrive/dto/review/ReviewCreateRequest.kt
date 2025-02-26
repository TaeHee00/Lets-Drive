package com.dugaza.letsdrive.dto.review

import com.dugaza.letsdrive.service.TargetType
import com.dugaza.letsdrive.validator.CustomValidator
import com.dugaza.letsdrive.validator.ValidEnum
import java.util.UUID

class ReviewCreateRequest(
    @field:CustomValidator.NotNull(message = "targetId는 필수 입력값입니다.")
    val targetId: UUID,
    @field:CustomValidator.NotNull(message = "evaluationId은 필수 입력값입니다.")
    val evaluationId: UUID,
    @field:ValidEnum(
        enumClass = TargetType::class,
        message = "Types are only available for Course.",
        allowNull = false,
        ignoreCase = false,
    )
    val targetType: TargetType,
    @field:CustomValidator.NotNull(message = "evaluationResultList는 필수 입력값입니다.")
    val evaluationResultList: List<UUID>,
    @field:CustomValidator.NotNull(message = "fileMasterId는 필수 입력값입니다.")
    var fileMasterId: UUID,
    @field:CustomValidator.NotBlank(message = "score는 필수 입력값입니다.")
//    @field:DecimalMin(
//        value = "0.5",
//        message = "score는 최소 0.5 이상이어야 합니다.",
//    )
//    @field:DecimalMax(
//        value = "5.0",
//        message = "score는 최대 5.0을 초과할 수 없습니다.",
//    )
    val score: Double,
    @field:CustomValidator.NotBlank(message = "content는 필수 입력값입니다.")
    @field:CustomValidator.Size(
        min = 1,
        max = 4000,
        message = "content는 1자 이상 4000자 이하로 작성해주세요.",
    )
    val content: String,
)
