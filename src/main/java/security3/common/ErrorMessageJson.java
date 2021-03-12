package security3.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Response model for a error message.
 *
 */
@Data
@Builder
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@ApiModel(description = "Response model for a Value Streamer error message.")
public class ErrorMessageJson implements VSErrorMessage {

    @ApiModelProperty(value = "A URI reference that identifies the problem type.")
    public String type;

    @ApiModelProperty(value = "A short, human-readable summary of the problem type.", required = true)
    public String title;

    @ApiModelProperty(value = "The HTTP status code generated by the origin server for this occurrence of the problem.", required = true)
    public Integer status;

    @ApiModelProperty(value = "A human-readable explanation specific to this occurrence of the problem.", required = true)
    public String detail;

    @ApiModelProperty(value = "A URI reference that identifies the specific occurrence of the problem.")
    public String instance;

}
