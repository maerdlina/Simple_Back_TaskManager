package ru.app.simple_back_taskmanager.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import ru.app.simple_back_taskmanager.enumeration.StatusEnum;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder
@Getter
public class SimpleTaskRequestDto {
    @JsonProperty("id")
    @Schema(description = "Uniq Id of task")
    private UUID id;

    @JsonProperty("task")
    @Schema(description = "task", example = "Buy a milk")
    private String task;

    @JsonProperty("description")
    @Schema(description = "description of task", example = "Go to the grocerry storage")
    private String description;

    @JsonProperty("deadline")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "UTC")
    @Schema(description = "deadline of task", example = "Go to the grocerry storage")
    private LocalDateTime deadline;

    @JsonProperty("status")
    @Schema(description = "status of task")
    private StatusEnum status;

    @JsonProperty("createAt")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "UTC")
    @Schema(description = "date & time where created task")
    private LocalDateTime createAt;
}
