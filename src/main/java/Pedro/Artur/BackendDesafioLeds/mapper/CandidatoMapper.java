package Pedro.Artur.BackendDesafioLeds.mapper;

import Pedro.Artur.BackendDesafioLeds.utils.CpfUtils;
import Pedro.Artur.BackendDesafioLeds.dtos.CandidatoResponseDTO;
import Pedro.Artur.BackendDesafioLeds.model.Candidato;

public class CandidatoMapper {

    public static CandidatoResponseDTO toDTO(Candidato candidato){
        CandidatoResponseDTO candidatoDto = new CandidatoResponseDTO();
        candidatoDto.setNome(candidato.getNome());
        candidatoDto.setDataNascimento(candidato.getDataNascimento());
        candidatoDto.setCpf(CpfUtils.formatar(candidato.getCpf()));

        return candidatoDto;
    }
}
