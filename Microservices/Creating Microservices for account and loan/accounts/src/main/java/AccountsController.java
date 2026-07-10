

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.accounts.dto.CustomerDto;
import com.example.accounts.dto.ResponseDto;
import com.example.accounts.service.IAccountsService;

@RestController
@RequestMapping("/api")
public class AccountsController {

    @Autowired
    private IAccountsService accountsService;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {

        accountsService.createAccount(customerDto);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto("201", "Account created successfully"));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto> fetchAccount(@RequestParam String mobileNumber) {

        return ResponseEntity.ok(accountsService.fetchAccount(mobileNumber));
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateAccount(@RequestBody CustomerDto customerDto) {

        accountsService.updateAccount(customerDto);

        return ResponseEntity.ok(new ResponseDto("200", "Account updated successfully"));
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteAccount(@RequestParam String mobileNumber) {

        accountsService.deleteAccount(mobileNumber);

        return ResponseEntity.ok(new ResponseDto("200", "Account deleted successfully"));
    }
}