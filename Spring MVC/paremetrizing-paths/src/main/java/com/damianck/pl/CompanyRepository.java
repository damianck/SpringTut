package com.damianck.pl;

import java.util.List;

interface CompanyRepository {
    List<Company> findAll();
    Company findOne(String name);
}
